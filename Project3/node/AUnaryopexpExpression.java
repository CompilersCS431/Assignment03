/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project3.node;

import Project3.analysis.*;

@SuppressWarnings("nls")
public final class AUnaryopexpExpression extends PExpression
{
    private PExpression _expression_;
    private TUnaryop _unaryop_;

    public AUnaryopexpExpression()
    {
        // Constructor
    }

    public AUnaryopexpExpression(
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TUnaryop _unaryop_)
    {
        // Constructor
        setExpression(_expression_);

        setUnaryop(_unaryop_);

    }

    @Override
    public Object clone()
    {
        return new AUnaryopexpExpression(
            cloneNode(this._expression_),
            cloneNode(this._unaryop_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnaryopexpExpression(this);
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

    public TUnaryop getUnaryop()
    {
        return this._unaryop_;
    }

    public void setUnaryop(TUnaryop node)
    {
        if(this._unaryop_ != null)
        {
            this._unaryop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unaryop_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression_)
            + toString(this._unaryop_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._unaryop_ == child)
        {
            this._unaryop_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._unaryop_ == oldChild)
        {
            setUnaryop((TUnaryop) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}