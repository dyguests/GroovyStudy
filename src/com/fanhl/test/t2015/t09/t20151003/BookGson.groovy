package com.fanhl.test.t2015.t09.t20151003

import com.google.gson.Gson


def book = new Book(issn: "201510", name: "麟的期刊2015年第10期", date: "2015-10-03")
book.readedPageNum = 23
book.pageCount = 62

book.relativePath = "201510"

println new Gson().toJson(book)