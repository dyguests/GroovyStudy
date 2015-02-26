package com.fanhl.test.t2015.t01.t20150124

Convert.from( String ).to( Date ).using { new java.text.SimpleDateFormat('MM-dd-yyyy').parse(value) }

def christmas = '12-25-2010' as Date
//Date christmas = '12-25-2010' as Date//过不去

println christmas