Closure lgd = { tag, msg -> println "[$tag]$msg" }

lgd 'Test', 'hello boy'

Closure lgdt = lgd.curry 'Test2'

lgdt 'lol,good to see you'