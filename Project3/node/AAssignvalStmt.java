/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project3.node;

import Project3.analysis.*;

@SuppressWarnings("nls")
public final class AAssignvalStmt extends PStmt
{
    private TId _id_;
    private TAssignment _assignment_;
    private PExpression _expression_;

    public AAssignvalStmt()
    {
        // Constructor
    }

    public AAssignvalStmt(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TAssignment _assignment_,
        @SuppressWarnings("hiding") PExpression _expression_)
    {
        // Constructor
        setId(_id_);

        setAssignment(_assignment_);

        setExpression(_expression_);

    }

    @Override
    public Object clone()
    {
        return new AAssignvalStmt(
            cloneNode(this._id_),
            cloneNode(this._assignment_),
            cloneNode(this._expression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssignvalStmt(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TAssignment getAssignment()
    {
        return this._assignment_;
    }

    public void setAssignment(TAssignment node)
    {
        if(this._assignment_ != null)
        {
            this._assignment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignment_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._assignment_)
            + toString(this._expression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._assignment_ == child)
        {
            this._assignment_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._assignment_ == oldChild)
        {
            setAssignment((TAssignment) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}