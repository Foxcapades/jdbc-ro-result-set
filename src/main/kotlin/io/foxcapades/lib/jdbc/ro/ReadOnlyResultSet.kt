package io.foxcapades.lib.jdbc.ro

import java.io.InputStream
import java.io.Reader
import java.math.BigDecimal
import java.net.URL
import java.sql.*
import java.sql.Array
import java.sql.Date
import java.util.*

/**
 * # Read Only `ResultSet`
 *
 * Thin, read only wrapper around a given result set that blocks actions that
 * mutate the state of the underlying [ResultSet] instance.
 *
 * All mutating methods will throw an [UnsupportedOperationException]
 *
 * @author Elizabeth Paige Harper - https://github.com/foxcapades
 * @since  1.0.0
 */
class ReadOnlyResultSet(private val raw: ResultSet) : ResultSet {

  override operator fun next(): Boolean {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun close() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun wasNull(): Boolean = raw.wasNull()

  override fun getString(columnIndex: Int): String? = raw.getString(columnIndex)

  override fun getBoolean(columnIndex: Int): Boolean = raw.getBoolean(columnIndex)

  override fun getByte(columnIndex: Int): Byte = raw.getByte(columnIndex)

  override fun getShort(columnIndex: Int): Short = raw.getShort(columnIndex)

  override fun getInt(columnIndex: Int): Int = raw.getInt(columnIndex)

  override fun getLong(columnIndex: Int): Long = raw.getLong(columnIndex)

  override fun getFloat(columnIndex: Int): Float = raw.getFloat(columnIndex)

  override fun getDouble(columnIndex: Int): Double = raw.getDouble(columnIndex)

  override fun getBigDecimal(columnIndex: Int, scale: Int): BigDecimal? = raw.getBigDecimal(columnIndex, scale)

  override fun getBytes(columnIndex: Int): ByteArray? = raw.getBytes(columnIndex)

  override fun getDate(columnIndex: Int): Date? = raw.getDate(columnIndex)

  override fun getTime(columnIndex: Int): Time? = raw.getTime(columnIndex)

  override fun getTimestamp(columnIndex: Int): Timestamp? = raw.getTimestamp(columnIndex)

  override fun getAsciiStream(columnIndex: Int): InputStream? = raw.getAsciiStream(columnIndex)

  override fun getUnicodeStream(columnIndex: Int): InputStream? = raw.getUnicodeStream(columnIndex)

  override fun getBinaryStream(columnIndex: Int): InputStream? = raw.getBinaryStream(columnIndex)

  override fun getString(columnLabel: String): String? = raw.getString(columnLabel)

  override fun getBoolean(columnLabel: String): Boolean = raw.getBoolean(columnLabel)

  override fun getByte(columnLabel: String): Byte = raw.getByte(columnLabel)

  override fun getShort(columnLabel: String): Short = raw.getShort(columnLabel)

  override fun getInt(columnLabel: String): Int = raw.getInt(columnLabel)

  override fun getLong(columnLabel: String): Long = raw.getLong(columnLabel)

  override fun getFloat(columnLabel: String): Float = raw.getFloat(columnLabel)

  override fun getDouble(columnLabel: String): Double = raw.getDouble(columnLabel)

  override fun getBigDecimal(columnLabel: String?, scale: Int): BigDecimal? = raw.getBigDecimal(columnLabel, scale)

  override fun getBytes(columnLabel: String): ByteArray? = raw.getBytes(columnLabel)

  override fun getDate(columnLabel: String): Date? = raw.getDate(columnLabel)

  override fun getTime(columnLabel: String): Time? = raw.getTime(columnLabel)

  override fun getTimestamp(columnLabel: String): Timestamp? = raw.getTimestamp(columnLabel)

  override fun getAsciiStream(columnLabel: String): InputStream? = raw.getAsciiStream(columnLabel)

  override fun getUnicodeStream(columnLabel: String): InputStream? = raw.getUnicodeStream(columnLabel)

  override fun getBinaryStream(columnLabel: String): InputStream? = raw.getBinaryStream(columnLabel)

  override fun getWarnings(): SQLWarning? = raw.warnings

  override fun clearWarnings() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun getCursorName(): String? = raw.cursorName

  override fun getMetaData(): ResultSetMetaData? = raw.metaData

  override fun getObject(columnIndex: Int): Any? = raw.getObject(columnIndex)

  override fun getObject(columnLabel: String): Any? = raw.getObject(columnLabel)

  override fun findColumn(columnLabel: String): Int = raw.findColumn(columnLabel)

  //--------------------------JDBC 2.0-----------------------------------

  override fun getCharacterStream(columnIndex: Int): Reader? = raw.getCharacterStream(columnIndex)

  override fun getCharacterStream(columnLabel: String): Reader? = raw.getCharacterStream(columnLabel)

  override fun getBigDecimal(columnIndex: Int): BigDecimal? = raw.getBigDecimal(columnIndex)

  override fun getBigDecimal(columnLabel: String): BigDecimal? = raw.getBigDecimal(columnLabel)

  override fun isBeforeFirst(): Boolean = raw.isBeforeFirst

  override fun isAfterLast(): Boolean = raw.isAfterLast

  override fun isFirst(): Boolean = raw.isFirst

  override fun isLast(): Boolean = raw.isLast

  override fun beforeFirst() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun afterLast() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun first(): Boolean {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun last(): Boolean {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun getRow(): Int = raw.row

  override fun absolute(row: Int): Boolean {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun relative(rows: Int): Boolean {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun previous(): Boolean {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun setFetchDirection(direction: Int) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun getFetchDirection(): Int = raw.fetchDirection

  override fun setFetchSize(rows: Int) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun getFetchSize(): Int = raw.fetchSize

  override fun getType(): Int = raw.type

  override fun getConcurrency(): Int = raw.concurrency

  override fun rowUpdated(): Boolean = raw.rowUpdated()

  override fun rowInserted(): Boolean = raw.rowInserted()

  override fun rowDeleted(): Boolean = raw.rowDeleted()

  override fun updateNull(columnIndex: Int) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBoolean(columnIndex: Int, x: Boolean) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateByte(columnIndex: Int, x: Byte) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateShort(columnIndex: Int, x: Short) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateInt(columnIndex: Int, x: Int) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateLong(columnIndex: Int, x: Long) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateFloat(columnIndex: Int, x: Float) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateDouble(columnIndex: Int, x: Double) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBigDecimal(columnIndex: Int, x: BigDecimal?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateString(columnIndex: Int, x: String?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBytes(columnIndex: Int, x: ByteArray?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateDate(columnIndex: Int, x: Date?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateTime(columnIndex: Int, x: Time?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateTimestamp(columnIndex: Int, x: Timestamp?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateAsciiStream(
    columnIndex: Int,
    x: InputStream?,
    length: Int
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBinaryStream(
    columnIndex: Int,
    x: InputStream?,
    length: Int
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateCharacterStream(
    columnIndex: Int,
    x: Reader?,
    length: Int
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateObject(columnIndex: Int, x: Any?, scaleOrLength: Int) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateObject(columnIndex: Int, x: Any?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNull(columnLabel: String) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBoolean(columnLabel: String?, x: Boolean) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateByte(columnLabel: String?, x: Byte) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateShort(columnLabel: String?, x: Short) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateInt(columnLabel: String?, x: Int) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateLong(columnLabel: String?, x: Long) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateFloat(columnLabel: String?, x: Float) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateDouble(columnLabel: String?, x: Double) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBigDecimal(columnLabel: String?, x: BigDecimal?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateString(columnLabel: String?, x: String?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBytes(columnLabel: String?, x: ByteArray?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateDate(columnLabel: String?, x: Date?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateTime(columnLabel: String?, x: Time?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateTimestamp(columnLabel: String?, x: Timestamp?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateAsciiStream(
    columnLabel: String?,
    x: InputStream?,
    length: Int
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBinaryStream(
    columnLabel: String?,
    x: InputStream?,
    length: Int
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateCharacterStream(
    columnLabel: String?,
    reader: Reader?,
    length: Int
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateObject(columnLabel: String?, x: Any?, scaleOrLength: Int) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateObject(columnLabel: String?, x: Any?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun insertRow() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateRow() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun deleteRow() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun refreshRow() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun cancelRowUpdates() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun moveToInsertRow() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun moveToCurrentRow() {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun getStatement(): Statement? = raw.statement

  override fun getObject(columnIndex: Int, map: Map<String?, Class<*>?>?): Any? = raw.getObject(columnIndex, map)

  override fun getRef(columnIndex: Int): Ref? = raw.getRef(columnIndex)

  override fun getBlob(columnIndex: Int): Blob? = raw.getBlob(columnIndex)

  override fun getClob(columnIndex: Int): Clob? = raw.getClob(columnIndex)

  override fun getArray(columnIndex: Int): Array? = raw.getArray(columnIndex)

  override fun getObject(columnLabel: String?, map: Map<String?, Class<*>?>?): Any? = raw.getObject(columnLabel, map)

  override fun getRef(columnLabel: String): Ref? = raw.getRef(columnLabel)

  override fun getBlob(columnLabel: String): Blob? = raw.getBlob(columnLabel)

  override fun getClob(columnLabel: String): Clob? = raw.getClob(columnLabel)

  override fun getArray(columnLabel: String): Array? = raw.getArray(columnLabel)

  override fun getDate(columnIndex: Int, cal: Calendar?): Date? = raw.getDate(columnIndex, cal)

  override fun getDate(columnLabel: String?, cal: Calendar?): Date? = raw.getDate(columnLabel, cal)

  override fun getTime(columnIndex: Int, cal: Calendar?): Time? = raw.getTime(columnIndex, cal)

  override fun getTime(columnLabel: String?, cal: Calendar?): Time? = raw.getTime(columnLabel, cal)

  override fun getTimestamp(columnIndex: Int, cal: Calendar?): Timestamp? = raw.getTimestamp(columnIndex, cal)

  override fun getTimestamp(columnLabel: String?, cal: Calendar?): Timestamp? = raw.getTimestamp(columnLabel, cal)

  //-------------------------- JDBC 3.0 ----------------------------------------

  override fun getURL(columnIndex: Int): URL? = raw.getURL(columnIndex)

  override fun getURL(columnLabel: String): URL? = raw.getURL(columnLabel)

  override fun updateRef(columnIndex: Int, x: Ref?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateRef(columnLabel: String?, x: Ref?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBlob(columnIndex: Int, x: Blob?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBlob(columnLabel: String?, x: Blob?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateClob(columnIndex: Int, x: Clob?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateClob(columnLabel: String?, x: Clob?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateArray(columnIndex: Int, x: Array?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateArray(columnLabel: String?, x: Array?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  //------------------------- JDBC 4.0 -----------------------------------

  override fun getRowId(columnIndex: Int): RowId? = raw.getRowId(columnIndex)

  override fun getRowId(columnLabel: String): RowId? = raw.getRowId(columnLabel)

  override fun updateRowId(columnIndex: Int, x: RowId?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateRowId(columnLabel: String?, x: RowId?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun getHoldability(): Int = raw.holdability

  override fun isClosed(): Boolean = raw.isClosed

  override fun updateNString(columnIndex: Int, nString: String?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNString(columnLabel: String?, nString: String?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNClob(columnIndex: Int, nClob: NClob?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNClob(columnLabel: String?, nClob: NClob?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun getNClob(columnIndex: Int): NClob? = raw.getNClob(columnIndex)

  override fun getNClob(columnLabel: String): NClob? = raw.getNClob(columnLabel)

  override fun getSQLXML(columnIndex: Int): SQLXML? = raw.getSQLXML(columnIndex)

  override fun getSQLXML(columnLabel: String): SQLXML? = raw.getSQLXML(columnLabel)

  override fun updateSQLXML(columnIndex: Int, xmlObject: SQLXML?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateSQLXML(columnLabel: String?, xmlObject: SQLXML?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun getNString(columnIndex: Int): String? = raw.getNString(columnIndex)

  override fun getNString(columnLabel: String): String? = raw.getNString(columnLabel)

  override fun getNCharacterStream(columnIndex: Int): Reader? = raw.getNCharacterStream(columnIndex)

  override fun getNCharacterStream(columnLabel: String): Reader? = raw.getNCharacterStream(columnLabel)

  override fun updateNCharacterStream(
    columnIndex: Int,
    x: Reader?,
    length: Long
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNCharacterStream(
    columnLabel: String?,
    reader: Reader?,
    length: Long
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateAsciiStream(
    columnIndex: Int,
    x: InputStream?,
    length: Long
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBinaryStream(
    columnIndex: Int,
    x: InputStream?,
    length: Long
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateCharacterStream(
    columnIndex: Int,
    x: Reader?,
    length: Long
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateAsciiStream(
    columnLabel: String?,
    x: InputStream?,
    length: Long
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBinaryStream(
    columnLabel: String?,
    x: InputStream?,
    length: Long
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateCharacterStream(
    columnLabel: String?,
    reader: Reader?,
    length: Long
  ) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBlob(columnIndex: Int, inputStream: InputStream?, length: Long) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBlob(columnLabel: String?, inputStream: InputStream?, length: Long) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateClob(columnIndex: Int, reader: Reader?, length: Long) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateClob(columnLabel: String?, reader: Reader?, length: Long) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNClob(columnIndex: Int, reader: Reader?, length: Long) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNClob(columnLabel: String?, reader: Reader?, length: Long) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNCharacterStream(columnIndex: Int, x: Reader?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNCharacterStream(columnLabel: String?, reader: Reader?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateAsciiStream(columnIndex: Int, x: InputStream?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBinaryStream(columnIndex: Int, x: InputStream?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateCharacterStream(columnIndex: Int, x: Reader?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateAsciiStream(columnLabel: String?, x: InputStream?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBinaryStream(columnLabel: String?, x: InputStream?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateCharacterStream(columnLabel: String?, reader: Reader?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBlob(columnIndex: Int, inputStream: InputStream?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateBlob(columnLabel: String?, inputStream: InputStream?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateClob(columnIndex: Int, reader: Reader?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateClob(columnLabel: String?, reader: Reader?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNClob(columnIndex: Int, reader: Reader?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateNClob(columnLabel: String?, reader: Reader?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  //------------------------- JDBC 4.1 -----------------------------------

  override fun <T> getObject(columnIndex: Int, type: Class<T>?): T = raw.getObject(columnIndex, type)

  override fun <T> getObject(columnLabel: String?, type: Class<T>?): T = raw.getObject(columnLabel, type)

  //------------------------- JDBC 4.2 -----------------------------------

  override fun updateObject(columnIndex: Int, x: Any?, targetSqlType: SQLType?, scaleOrLength: Int) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateObject(columnLabel: String?, x: Any?, targetSqlType: SQLType?, scaleOrLength: Int) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateObject(columnIndex: Int, x: Any?, targetSqlType: SQLType?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun updateObject(columnLabel: String?, x: Any?, targetSqlType: SQLType?) {
    throw UnsupportedOperationException("Cannot mutate a read only result set.")
  }

  override fun <T : Any?> unwrap(iface: Class<T>?): T  {
    throw UnsupportedOperationException("Cannot unwrap a read only result set.")
  }

  override fun isWrapperFor(iface: Class<*>?): Boolean = raw.isWrapperFor(iface)
}