package Controller.Actions;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class PeliculaAction implements IAction{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response, String action) {
        String cadDestino = "";
        switch (action) {
            case "FIND_ALL":
                cadDestino = findAll(request, response);
                break;
        }

        return cadDestino;
    }

    //Crearemos un objeto película y creamos procedimientos
    private String findAll(){

    }
}
