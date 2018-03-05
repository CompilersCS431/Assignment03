/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project3.node;

import Project3.analysis.*;

@SuppressWarnings("nls")
public final class ABinopexpExpression extends PExpression
{
    private PExpression _expression_;
    private TAddsub _addsub_;
    private PTerm _term_;

    public ABinopexpExpression()
    {
        // Constructor
    }

    public ABinopexpExpression(
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TAddsub _addsub_,
        @SuppressWarnings("hiding") PTerm _term_)
    {
        // Constructor
        setExpression(_expression_);

        setAddsub(_addsub_);

        setTerm(_term_);

    }

    @Override
    public Object clone()
    {
        return new ABinopexpExpression(
            cloneNode(this._expression_),
            cloneNode(this._addsub_),
            cloneNode(this._term_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABinopexpExpression(this);
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

    public TAddsub getAddsub()
    {
        return this._addsub_;
    }

    public void setAddsub(TAddsub node)
    {
        if(this._addsub_ != null)
        {
            this._addsub_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._addsub_ = node;
    }

    public PTerm getTerm()
    {
        return this._term_;
    }

    public void setTerm(PTerm node)
    {
        if(this._term_ != null)
        {
            this._term_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._term_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression_)
            + toString(this._addsub_)
            + toString(this._term_);
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

        if(this._addsub_ == child)
        {
            this._addsub_ = null;
            return;
        }

        if(this._term_ == child)
        {
            this._term_ = null;
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

        if(this._addsub_ == oldChild)
        {
            setAddsub((TAddsub) newChild);
            return;
        }

        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
