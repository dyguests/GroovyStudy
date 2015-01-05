pattern = ~"(G|g)roovy"
text = 'Groovy is Great!!!'
text2 = 'Java is Great!!!'

//局部匹配
if (text =~ pattern) {
    println "match"
} else {
    println "not match"
}

//精确匹配
if (text ==~ pattern) {
    println "match"
} else {
    println "not match"
}

if ('my name is fanhl' =~ ~/is|are/) {
    println 'match'
} else {
    println 'not match'
}

println "text =~ pattern: ${text =~ pattern}"
println "text ==~ pattern: ${text ==~ pattern}"

println "text2 =~ pattern: ${text2 =~ pattern}"
println "text2 ==~ pattern: ${text2 ==~ pattern}"


matcher = "Groovy is groovy,java is not a groovy" =~ /(G|g)roovy/
//println "$matcher : ${matcher.size()} : ${all='';matcher.each{a+='$it '};all}"
println "$matcher : ${matcher.size()} : ${matcher[0]} ${matcher[1]} ${matcher[2]} "