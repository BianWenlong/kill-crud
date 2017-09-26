package com.dianping.killcrud.parse;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.create.table.CreateTable;

/**
 *
 * @author Mr.Bian
 *
 */
public class SqlParse {
	
	public static void main(String[] args) throws JSQLParserException{
		Statement stmt = CCJSqlParserUtil.parse("create table a  (id varchar(50) not null auto_increment comment 'id') comment 'test'");
		CreateTable create = (CreateTable) stmt;
		System.out.println(create.getColumnDefinitions().get(0).getColumnSpecStrings());
	}
}
