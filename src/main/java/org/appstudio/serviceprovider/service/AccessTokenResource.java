package org.appstudio.serviceprovider.service;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;
import java.util.Set;

@Path("token")
public class AccessTokenResource {
  @Inject AccessTokenService accessTokenService;
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Set<AccessToken> fetchAll() {
    return accessTokenService.fetchAll();
  }

  @GET
  @Path("{name}")
  @Produces(MediaType.APPLICATION_JSON)
  public Response get(@PathParam("name") String name) {
    Optional<AccessToken> token = accessTokenService.get(name);
    if(token.isEmpty()){
      return Response.status(Response.Status.NOT_FOUND).build();
    }
    return Response.ok().entity(token.get()).build();
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response create(AccessToken accessToken) {
    accessTokenService.create(accessToken);
    return Response.status(Response.Status.CREATED).build();
  }

  @PUT
  @Path("/{name}")
  @Consumes(MediaType.APPLICATION_JSON)
  public Response update(@PathParam("name") String name, AccessToken accessToken) {
    accessTokenService.update(accessToken);
    return Response.noContent().build();
  }

  @DELETE
  @Path("/{name}")
  public Response delete(@PathParam("name") String name) {
    accessTokenService.delete(name);
    return Response.status(202).entity("Token deleted successfully !!").build();
  }
}
