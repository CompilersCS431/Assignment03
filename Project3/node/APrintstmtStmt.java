/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project3.node;

import Project3.analysis.*;

@SuppressWarnings("nls")
public final class APrintstmtStmt extends PStmt
{
    private TEcho _echo_;
    private TLparen _lparen_;
    private PExplist _explist_;
    private TRparen _rparen_;

    public APrintstmtStmt()
    {
        // Constructor
    }

    public APrintstmtStmt(
        @SuppressWarnings("hiding") TEcho _echo_,
        @SuppressWarnings("hiding") TLparen _lparen_,
        @SuppressWarnings("hiding") PExplist _explist_,
        @SuppressWarnings("hiding") TRparen _rparen_)
    {
        // Constructor
        setEcho(_echo_);

        setLparen(_lparen_);

        setExplist(_explist_);

        setRparen(_rparen_);

    }

    @Override
    public Object clone()
    {
        return new APrintstmtStmt(
            cloneNode(this._echo_),
            cloneNode(this._lparen_),
            cloneNode(this._explist_),
            cloneNode(this._rparen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrintstmtStmt(this);
    }

    public TEcho getEcho()
    {
        return this._echo_;
    }

    public void setEcho(TEcho node)
    {
        if(this._echo_ != null)
        {
            this._echo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._echo_ = node;
    }

    public TLparen getLparen()
    {
        return this._lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(this._lparen_ != null)
        {
            this._lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lparen_ = node;
    }

    public PExplist getExplist()
    {
        return this._explist_;
    }

    public void setExplist(PExplist node)
    {
        if(this._explist_ != null)
        {
            this._explist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._explist_ = node;
    }

    public TRparen getRparen()
    {
        return this._rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(this._rparen_ != null)
        {
            this._rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rparen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._echo_)
            + toString(this._lparen_)
            + toString(this._explist_)
            + toString(this._rparen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._echo_ == child)
        {
            this._echo_ = null;
            return;
        }

        if(this._lparen_ == child)
        {
            this._lparen_ = null;
            return;
        }

        if(this._explist_ == child)
        {
            this._explist_ = null;
            return;
        }

        if(this._rparen_ == child)
        {
            this._rparen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._echo_ == oldChild)
        {
            setEcho((TEcho) newChild);
            return;
        }

        if(this._lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(this._explist_ == oldChild)
        {
            setExplist((PExplist) newChild);
            return;
        }

        if(this._rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
