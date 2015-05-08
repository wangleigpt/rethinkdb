// Autogenerated by convert_protofile.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class TableList extends RqlQuery {


    public TableList(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public TableList(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public TableList(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.TABLE_LIST, args, optargs);
    }
    protected TableList(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static TableList fromArgs(Object... args){
        return new TableList(new Arguments(args), null);
    }


}
