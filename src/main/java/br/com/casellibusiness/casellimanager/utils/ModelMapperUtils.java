package br.com.casellibusiness.casellimanager.utils;

import org.modelmapper.ModelMapper;

public class ModelMapperUtils {

    public static <S,D> D map(S source, Class<D> dest){
        return new ModelMapper().map(source, dest);
    }
}
