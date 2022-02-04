
package carsaledemoapp.carsaledemoapp;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import carsaledemoapp.beans.CarDetails;
import carsaledemoapp.repository.CarRepository;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/carsale")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public List<CarDetails> getIt() {
    	CarRepository carRepo = new CarRepository();
    	return carRepo.getCars();
    }
    
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/car/1001")
    public CarDetails getCar() {
        return new CarRepository().getCar(1001);
    }
}
