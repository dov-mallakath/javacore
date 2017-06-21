package com.kitcenter.runners.classwork.Lesson17;

import com.kitcenter.app.classwork.Lesson17.Company;
import com.kitcenter.app.classwork.lesson5.Calculator;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-21
 */
public class CompanyRunner {

    public static void main(String[] args) {
        for (Company company: Company.values()){
            System.out.println(company.getFullName());
        }
    }

}
