/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project3.analysis;

import java.util.*;
import Project3.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPExpression().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inATermExpression(ATermExpression node)
    {
        defaultIn(node);
    }

    public void outATermExpression(ATermExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermExpression(ATermExpression node)
    {
        inATermExpression(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outATermExpression(node);
    }

    public void inABinopexpExpression(ABinopexpExpression node)
    {
        defaultIn(node);
    }

    public void outABinopexpExpression(ABinopexpExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABinopexpExpression(ABinopexpExpression node)
    {
        inABinopexpExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getAddsub() != null)
        {
            node.getAddsub().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outABinopexpExpression(node);
    }

    public void inAUnaryopexpExpression(AUnaryopexpExpression node)
    {
        defaultIn(node);
    }

    public void outAUnaryopexpExpression(AUnaryopexpExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnaryopexpExpression(AUnaryopexpExpression node)
    {
        inAUnaryopexpExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getUnaryop() != null)
        {
            node.getUnaryop().apply(this);
        }
        outAUnaryopexpExpression(node);
    }

    public void inASingleTerm(ASingleTerm node)
    {
        defaultIn(node);
    }

    public void outASingleTerm(ASingleTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleTerm(ASingleTerm node)
    {
        inASingleTerm(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outASingleTerm(node);
    }

    public void inAMultipleTerm(AMultipleTerm node)
    {
        defaultIn(node);
    }

    public void outAMultipleTerm(AMultipleTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultipleTerm(AMultipleTerm node)
    {
        inAMultipleTerm(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getMuldivmod() != null)
        {
            node.getMuldivmod().apply(this);
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAMultipleTerm(node);
    }

    public void inAIdValue(AIdValue node)
    {
        defaultIn(node);
    }

    public void outAIdValue(AIdValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdValue(AIdValue node)
    {
        inAIdValue(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdValue(node);
    }

    public void inANumberValue(ANumberValue node)
    {
        defaultIn(node);
    }

    public void outANumberValue(ANumberValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberValue(ANumberValue node)
    {
        inANumberValue(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberValue(node);
    }

    public void inAMultipleExplist(AMultipleExplist node)
    {
        defaultIn(node);
    }

    public void outAMultipleExplist(AMultipleExplist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultipleExplist(AMultipleExplist node)
    {
        inAMultipleExplist(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getExplist() != null)
        {
            node.getExplist().apply(this);
        }
        outAMultipleExplist(node);
    }

    public void inASingleExplist(ASingleExplist node)
    {
        defaultIn(node);
    }

    public void outASingleExplist(ASingleExplist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleExplist(ASingleExplist node)
    {
        inASingleExplist(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outASingleExplist(node);
    }

    public void inAAssignvalStmt(AAssignvalStmt node)
    {
        defaultIn(node);
    }

    public void outAAssignvalStmt(AAssignvalStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignvalStmt(AAssignvalStmt node)
    {
        inAAssignvalStmt(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAssignment() != null)
        {
            node.getAssignment().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAAssignvalStmt(node);
    }

    public void inAPrintstmtStmt(APrintstmtStmt node)
    {
        defaultIn(node);
    }

    public void outAPrintstmtStmt(APrintstmtStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintstmtStmt(APrintstmtStmt node)
    {
        inAPrintstmtStmt(node);
        if(node.getEcho() != null)
        {
            node.getEcho().apply(this);
        }
        if(node.getLparen() != null)
        {
            node.getLparen().apply(this);
        }
        if(node.getExplist() != null)
        {
            node.getExplist().apply(this);
        }
        if(node.getRparen() != null)
        {
            node.getRparen().apply(this);
        }
        outAPrintstmtStmt(node);
    }

    public void inAMultipleStmts(AMultipleStmts node)
    {
        defaultIn(node);
    }

    public void outAMultipleStmts(AMultipleStmts node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultipleStmts(AMultipleStmts node)
    {
        inAMultipleStmts(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getStmts() != null)
        {
            node.getStmts().apply(this);
        }
        outAMultipleStmts(node);
    }

    public void inASingleStmts(ASingleStmts node)
    {
        defaultIn(node);
    }

    public void outASingleStmts(ASingleStmts node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleStmts(ASingleStmts node)
    {
        inASingleStmts(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outASingleStmts(node);
    }
}