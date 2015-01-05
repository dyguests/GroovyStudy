def shoutString(String str) {
    println str.shout()
}

str='hellllo'
String.metaClass.shout={-> toUpperCase()}

shoutString(str)

