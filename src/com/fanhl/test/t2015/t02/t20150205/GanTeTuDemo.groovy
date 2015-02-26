package com.fanhl.test.t2015.t02.t20150205

class Condition {
    Event event//前置事件
    int interval//前置事件完成间隔时间

    @Override
    String toString() { "(${event.name},$interval)" }
}

class Event {
    int name//工作包名
    Date startDate
    Date endDate

    Condition[] conditions//前置条件

    @Override
    String toString() {
        "<N:$name,C:$conditions>"
    }
}

def computeDate(Event[] events, Date startDate) {
    events.max {}

}

/**取得工作完成日期*/
Date getWorkEndDate(Date workStartDate) {
    nextWorkDate(nextWorkDate(workStartDate))//每个工作包完成时间为2个工作日
}

Date nextWorkDate(Date date) { nearstWorkDate(date.next()) }

Date nearstWorkDate(Date date) {
    while (!isWorkDay(date)) date = date.next()
    date
}

/**是否是周一到周五*/
boolean isWorkDay(Date date) {/*FIXME*/ true }

Event e1 = new Event(name: 1, conditions: [])
Event e3 = new Event(name: 1, conditions: [new Condition(event: e1, interval: 4)])
Event e5 = new Event(name: 1, conditions: [new Condition(event: e1, interval: 3)])
Event e7 = new Event(name: 1, conditions: [new Condition(event: e1, interval: 6)])
Event e9 = new Event(name: 1, conditions: [new Condition(event: e3, interval: 8), new Condition(event: e5, interval: 7)])
Event e11 = new Event(name: 1, conditions: [new Condition(event: e5, interval: 6), new Condition(event: e7, interval: 2)])
Event e13 = new Event(name: 1, conditions: [new Condition(event: e9, interval: 2), new Condition(event: e11, interval: 5)])

Event[] events = [e1, e3, e5, e7, e9, e11, e13]

computeDate(events, new Date())
