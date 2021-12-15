package dispatch;

public class ProductionFactory 
{
    public static Action route( String cmd)
    {
        if( cmd.equals("selectProduct"))
            return new SelectAction();
        else if(cmd.equals("insertProduct") )
            return new InsertAction();
        else if(cmd.equals("deleteProduct") )
            return new DeleteAction();
        else if(cmd.equals("modifyProduct") )
            return new ModifyAction();
        else if(cmd.equals("searchProduct") )
            return new SearchAction();
        else
            return null;
    }
}
