import javax.swing.*
import java.awt.*
import java.awt.event.ActionListener
import java.awt.event.FocusListener
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener

frame = new Frame(size: [300, 300], layout: new FlowLayout())
button = new JButton("click")
positionLabel = new JLabel("")
msgLabel = new JLabel("")
frame.add button
frame.add positionLabel
frame.add msgLabel
button.addActionListener({ JOptionPane.showMessageDialog(frame, "You clicked!") } as ActionListener)

displayMouseLocation = { positionLabel.setText("$it.x,$it.y") }
frame.addMouseListener(displayMouseLocation as MouseListener)
frame.addMouseMotionListener(displayMouseLocation as MouseMotionListener)

handleFocus = [
        focusGained: { msgLabel.setText("Good to see you!") },
        focusLost  : { msgLabel.setText("Come back soon!") }
]
button.addFocusListener(handleFocus as FocusListener)

events = ['WindowListener', 'ComponentListener']
handler = { msgLabel.setText("$it") }
events.each {
    handlerImpl = handler.asType(Class.forName("java.awt.event.${it}"))
    frame."add${it}"(handlerImpl)
}

frame.setVisible(true)