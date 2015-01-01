import java.awt.Button
import java.awt.event.ActionListener
import java.awt.event.FocusListener

def openFile(name) {
    new FileInputStream(name)
}

try {
    openFile("fuck")
} catch (ex) {
    println "Oops: " + ex
}

class Wizard {
    def static learn(trick, action) {
        println trick + action()
        this
    }
}

Wizard.learn('aj', { -> 1 })
        .learn('bi', { -> 2 })

new Button().addActionListener({
    //..
} as ActionListener)

handleFocus = [
        focusGained: {},
        focusLost  : {}
]
new Button().addFocusListener(handleFocus as FocusListener)

