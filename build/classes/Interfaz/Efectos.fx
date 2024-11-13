/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javax.swing.JTree;
import javafx.ext.swing.SwingComponent;
import javafx.animation.transition.FadeTransition;

var tree = SwingComponent.wrap(new JTree());

tree.translateY = 50;
tree.height = 600;
tree.width = 400;

Stage {
    title: "Add JTree"
    width: 200
    height: 400
    scene: Scene {
         content : tree
        }
        x: 10,
        y: 10
}

var fadeTransition = FadeTransition {
        duration: 3s node: tree
        fromValue: 1.0 toValue: 0.1
        repeatCount:10 autoReverse: true
    }
fadeTransition.play();