package com.softtech.springrestapi.shared.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.List;

public class EnhancedModelMapper extends ModelMapper {
    public EnhancedModelMapper() {
        super();
        getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }
    public <S,T> List<T> mapList(List<S> sourceList, Class<T> targetClass){
        return sourceList.stream().map(sourceItem -> this.map(sourceItem, targetClass)).toList();
    }
}
