package io.mycat.backend.es;

import com.alibaba.druid.util.jdbc.ResultSetMetaDataBase;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by allwefantasy on 8/31/16.
 */
public class ElasticSearchResultSetMetaDataBase extends ResultSetMetaDataBase {

    private final List<ColumnMetaData> columns = new ArrayList<ColumnMetaData>();

    public ElasticSearchResultSetMetaDataBase(List<ObjectNode> headers) {
        for (ObjectNode column : headers) {
            ColumnMetaData columnMetaData = new ColumnMetaData();
            columnMetaData.setColumnLabel(column.get("Field").asText());
            columnMetaData.setColumnName(column.get("Field").asText());
            String type = column.get("Type").asText();
            if (type.equals("bigint")) {
                columnMetaData.setColumnType(-5);
            } else if (type.equals("int")) {
                columnMetaData.setColumnType(4);
            } else if (type.equals("datetime")) {
                columnMetaData.setColumnType(91);
            } else {
                columnMetaData.setColumnType(12);
            }
            columnMetaData.setColumnTypeName(type);
            columns.add(columnMetaData);
        }
    }

    @Override
    public int getColumnCount() throws SQLException {
        return columns.size();
    }

    @Override
    public int getColumnDisplaySize(int column) throws SQLException {
        return super.getColumnDisplaySize(column);
    }

    @Override
    public String getColumnLabel(int column) throws SQLException {
        return columns.get(column - 1).getColumnName();
    }

    @Override
    public ColumnMetaData getColumn(int column) {
        return columns.get(column - 1);
    }

    @Override
    public String getColumnName(int column) throws SQLException {
        return columns.get(column - 1).getColumnName();
    }

    @Override
    public String getCatalogName(int column) throws SQLException {
        return super.getCatalogName(column);
    }

    @Override
    public int getColumnType(int column) throws SQLException {
        return super.getColumnType(column);
    }

    @Override
    public String getColumnTypeName(int column) throws SQLException {
        return super.getColumnTypeName(column);
    }

    @Override
    public String getColumnClassName(int column) throws SQLException {
        return super.getColumnClassName(column);
    }

    @Override
    public List<ColumnMetaData> getColumns() {
        return columns;
    }
}
