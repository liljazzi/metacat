/* Generated By:JJTree: Do not edit this line. ASTNUM.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.netflix.metacat.common.partition.parser;

public
class ASTNUM extends SimpleNode {
  public ASTNUM(int id) {
    super(id);
  }

  public ASTNUM(PartitionParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PartitionParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8c978f5115fa4de48e54d30148a58bf1 (do not edit this line) */