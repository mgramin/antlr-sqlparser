package com.restlet.sqlimport.report;

/**
 * Status of the import.
 */
public enum ReportStatus {

	/** Successful import */
	SUCCESS,

	/** SQL query filtered : not a CREATE TABLE or a ALTER TABLE */
	FILTERED,

	/** SQL query not filtered - it is a temporary status : the query will be parsed by the parser */
	TO_PARSE,

	/** Error during parsing */
	PARSING_ERROR,

	/** Unknown SQL type */
	UNKNOWN_SQL_TYPE,

	/** More than one column in the primary key */
	PRIMARY_KEY_MORE_THAN_ONE_COLUMN,

	/** More than one column in the foreign key */
	FOREIGN_KEY_MORE_THAN_ONE_COLUMN,

	/** Not valid database */
	NOT_VALID_DATABASE

}
