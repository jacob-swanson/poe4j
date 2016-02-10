package com.swandiggy.poe4j;

import com.swandiggy.poe4j.config.Poe4jProperties;
import com.swandiggy.poe4j.data.DatFileLookup;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.readers.FieldReaders;
import com.swandiggy.poe4j.data.readers.ValueReaders;
import com.swandiggy.poe4j.data.readers.field.*;
import com.swandiggy.poe4j.data.readers.value.*;
import com.swandiggy.poe4j.ggpkg.GgpkExtractor;
import com.swandiggy.poe4j.ggpkg.GgpkFactory;
import com.swandiggy.poe4j.ggpkg.factory.*;
import com.swandiggy.poe4j.util.aspect.RuntimeMonitorAspect;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Auto-configuration for poe4j. If you don't want to use Spring or whatever, you can figure out how to hook all of
 * these functions up, but I'm lazy. At least I was nice enough to not use component scanning.
 *
 * @author Jacob Swanson
 * @since 1/24/2016
 */
@Configuration
@EnableConfigurationProperties(Poe4jProperties.class)
public class Poe4jAutoConfiguration {

    @Bean
    public EnumFieldReader enumReader() {
        return new EnumFieldReader();
    }

    @Bean
    public ListFieldReader listReader(ValueReaders valueReaders) {
        return new ListFieldReader(valueReaders);
    }

    @Bean
    public ReferenceFieldReader referenceReader(DatFileReaderFactory datFileReaderFactory) {
        ReferenceFieldReader referenceFieldReader = new ReferenceFieldReader();
        referenceFieldReader.setDatFileReaderFactory(datFileReaderFactory);

        return referenceFieldReader;
    }

    @Bean
    public ReferenceOneFieldReader referenceOneFieldReader(DatFileReaderFactory datFileReaderFactory) {
        ReferenceOneFieldReader referenceOneFieldReader = new ReferenceOneFieldReader();
        referenceOneFieldReader.setDatFileReaderFactory(datFileReaderFactory);

        return referenceOneFieldReader;
    }

    @Bean
    public ValueFieldReader valueFieldReader(ValueReaders valueReaders) {
        return new ValueFieldReader(valueReaders);
    }

    @Bean
    public FieldReaders fieldReaders(FieldReader[] fieldReaders,
                                     ReferenceOneFieldReader referenceOneFieldReader,
                                     DatFileReaderFactory datFileReaderFactory) {
        FieldReaders delegatingFieldReader = new FieldReaders(fieldReaders);

        referenceOneFieldReader.setFieldReaders(delegatingFieldReader);
        datFileReaderFactory.setFieldReaders(delegatingFieldReader);

        return delegatingFieldReader;
    }


    @Bean
    public BooleanReader booleanReader() {
        return new BooleanReader();
    }

    @Bean
    public ByteReader byteReader() {
        return new ByteReader();
    }

    @Bean
    public IntReader intReader() {
        return new IntReader();
    }

    @Bean
    public LongReader longReader() {
        return new LongReader();
    }

    @Bean
    public RowReader rowReader(DatFileReaderFactory datFileReaderFactory) {
        return new RowReader(datFileReaderFactory);
    }

    @Bean
    public ShortReader shortReader() {
        return new ShortReader();
    }

    @Bean
    public StringReader stringReader() {
        return new StringReader();
    }

    @Bean
    public ValueReaders valueReaders(ValueReader[] valueReaders, ReferenceFieldReader referenceFieldReader) {
        ValueReaders deletatingValueReader = new ValueReaders(valueReaders);

        referenceFieldReader.setValueReaders(deletatingValueReader);

        return deletatingValueReader;
    }



    @Bean
    public DatFileLookup datFileLookup(Poe4jProperties properties, GgpkFactory ggpkFactory, GgpkExtractor ggpkExtractor) {
        return new DatFileLookup(properties, ggpkFactory, ggpkExtractor);
    }

    @Bean
    public DatFileReaderFactory datFileReaderFactory(DatFileLookup datFileLookup) {
        DatFileReaderFactory datFileReaderFactory = new DatFileReaderFactory();
        datFileReaderFactory.setDatFileLookup(datFileLookup);

        return datFileReaderFactory;
    }


    @Bean
    public DirectoryRecordFactory directoryRecordFactory() {
        return new DirectoryRecordFactory();
    }

    @Bean
    public FileRecordFactory fileRecordFactory() {
        return new FileRecordFactory();
    }

    @Bean
    public FreeRecordFactory freeRecordFactory() {
        return new FreeRecordFactory();
    }

    @Bean
    public GgpkgRecordFactory ggpkgRecordFactory() {
        return new GgpkgRecordFactory();
    }


    @Bean
    public GgpkExtractor ggpkExtractor() {
        return new GgpkExtractor();
    }

    @Bean
    public GgpkFactory ggpkFactory(RecordFactory[] recordFactories) {
        return new GgpkFactory(recordFactories);
    }


    @Bean
    public RuntimeMonitorAspect runtimeMonitorAspect() {
        return new RuntimeMonitorAspect();
    }
}
