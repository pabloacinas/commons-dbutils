module org.apache.commons.dbutils {
    requires java.logging;
    requires java.desktop;
    requires java.sql;
    exports org.apache.commons.dbutils;
    exports org.apache.commons.dbutils.handlers;
    exports org.apache.commons.dbutils.handlers.columns;
    exports org.apache.commons.dbutils.handlers.properties;
    exports org.apache.commons.dbutils.wrappers;
    provides org.apache.commons.dbutils.ColumnHandler with org.apache.commons.dbutils.handlers.columns.StringColumnHandler, org.apache.commons.dbutils.handlers.columns.IntegerColumnHandler, org.apache.commons.dbutils.handlers.columns.BooleanColumnHandler, org.apache.commons.dbutils.handlers.columns.LongColumnHandler, org.apache.commons.dbutils.handlers.columns.DoubleColumnHandler, org.apache.commons.dbutils.handlers.columns.FloatColumnHandler, org.apache.commons.dbutils.handlers.columns.ShortColumnHandler, org.apache.commons.dbutils.handlers.columns.ByteColumnHandler, org.apache.commons.dbutils.handlers.columns.TimestampColumnHandler, org.apache.commons.dbutils.handlers.columns.SQLXMLColumnHandler;
    provides org.apache.commons.dbutils.PropertyHandler with org.apache.commons.dbutils.handlers.properties.DatePropertyHandler, org.apache.commons.dbutils.handlers.properties.StringEnumPropertyHandler;
    uses org.apache.commons.dbutils.ColumnHandler;
    uses org.apache.commons.dbutils.PropertyHandler;
}
