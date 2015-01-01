def helpMe(helper) {
    helper.helpMoveThings()
}

class God{
    def helpMoveThings(){
        println "我用意念 移动物体"
    }
}

helpMe(new God())

