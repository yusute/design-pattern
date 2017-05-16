package com.yusute.pattern.filter;

import java.util.List;

/**
 * Created by yusutehot on 5/16/2017.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}