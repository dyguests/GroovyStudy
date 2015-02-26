def lst = new File("winner.txt").text.split("\n").collect { it.split(",") }
def findCountry = { l, y -> println "年份:$y,夺冠国家:${l.grep { it[0] == "$y" }.collect { it[2] }}" }.curry lst
def findYear = { l, c -> println "国家:$c,夺冠年份:${l.grep { it[2] == c }.collect { it[0] }}" }.curry lst

findCountry 1930
findYear "巴西"