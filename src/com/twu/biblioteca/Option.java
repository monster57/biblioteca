package com.twu.biblioteca;

public class Option {
    private String option;

    public Option(String option) {
        this.option = option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Option option1 = (Option) o;

        if (!option.equals(option1.option)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return option.hashCode();
    }

    @Override
    public String toString() {
        return option;

    }
}
