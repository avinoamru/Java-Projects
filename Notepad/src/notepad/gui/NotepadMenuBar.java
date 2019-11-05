
package notepad.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotepadMenuBar extends JMenuBar  {


    JMenuBar menuBar() {
        JMenuBar mBar = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mEdit = new JMenu("Edit");
        JMenuItem fileNew, fileOpen, fileSave, fileSaveAs;

        fileNew = new JMenuItem("New");
        fileOpen = new JMenuItem("Open");
        fileSave = new JMenuItem("Save");
        fileSaveAs = new JMenuItem("Save as..");

        mFile.add(fileNew);
        mFile.add(fileOpen);
        mFile.add(fileSave);
        mFile.add(fileSaveAs);

        mBar.add(mFile);
        mBar.add(mEdit);


        return mBar;
    }




}
