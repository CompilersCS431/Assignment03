/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project3.node;

import Project3.analysis.*;

@SuppressWarnings("nls")
public final class TUnaryop extends Token
{
    public TUnaryop(String text)
    {
        setText(text);
    }

    public TUnaryop(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TUnaryop(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUnaryop(this);
    }
}
