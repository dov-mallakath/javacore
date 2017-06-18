package com.kitcenter.app.homework.Lesson14;

import com.kitcenter.app.homework.Lesson13.Human;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-19
 */
public class WhiteCollar extends Human {

    private String companyName;

    public WhiteCollar(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        String regexp = "([aA-zZ,0-9,\\-, ,\\,])";
        String[] mismatches = companyName.split(regexp);
        if (mismatches.length == 0) {
            this.companyName = companyName;
        } else {
            System.out.println("Company name is invalid");
        }
    }

    @Override
    public String toString(){
        return "Name is: " + getName() + "\n" + "Age is: " + getAge() + "\n" + "Company name is: " + getCompanyName();
    }
}
