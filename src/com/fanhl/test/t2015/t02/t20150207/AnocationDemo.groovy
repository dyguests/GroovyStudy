package com.fanhl.test.t2015.t02.t20150207

import groovy.transform.ToString

@ToString
class Name {
    String first, second

    Name(String first, String second) {
        this.first = first
        this.second = second
    }
}

@Newify(Name)
def createName(String first, String second) {
    Name(first, second)
}


println createName("fan", "hl")