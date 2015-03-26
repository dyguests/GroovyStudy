package com.fanhl.test.t2015.t03.t20150320

def testSwitch(val) {
    switch (val) {
        case ~/^Switch.*Groovy$/: return 'Pattern match'
        case BigInteger: return 'Class isInstance'
        case 60..90: return 'Range contains'
        case [21, 'test', 9.12]: return 'List contains'
        case 42.056: return 'Object equals'
        case { it instanceof Integer && it < 50 }: return 'Closure boolean'
        default: return 'Default'
    }
}

assert 'Pattern match' == testSwitch("Switch to Groovy")
assert 'Class isInstance' == testSwitch(42G)
assert 'Range contains' == testSwitch(70)
assert 'List contains' == testSwitch('test')
assert 'Object equals' == testSwitch(42.056)
assert 'Closure boolean' == testSwitch(20)
assert 'Default' == testSwitch('default')