package com.fanhl.test.t2015.t03.t20150319

import groovy.transform.ToString

@ToString
class Round extends ChainList<Turn> {
    String title
}

@ToString
class Turn extends ChainList<Action> implements ChainList.Chainable<Turn> {
    String title
}

@ToString
class Action implements ChainList.Chainable<Action> {
    String title
}

def round = new Round(title: "Round1")

round.add(new Turn(title: "Turn1"))
round.add(new Turn(title: "Turn2"))

round.last.prev.add(new Action(title: "Action11"))
round.last.add(new Action(title: "Action21"))
round.last.add(new Action(title: "Action22"))

println round