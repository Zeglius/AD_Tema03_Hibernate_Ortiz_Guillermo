package SwingModels;

import javax.swing.table.AbstractTableModel;

public abstract class AbstractDAOTableModel extends AbstractTableModel {
    protected boolean isTableEditable = false;


    @Override
    abstract public String getColumnName(int column);

    @Override
    public abstract boolean isCellEditable(int rowIndex, int columnIndex);

    @SuppressWarnings("unused")
    public abstract boolean isTableEditable();

}
