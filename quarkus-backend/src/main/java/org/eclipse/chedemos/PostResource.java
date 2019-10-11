package org.eclipse.chedemos;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.common.base.Strings;

import org.jboss.logging.Logger;


@Path("/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostResource {
  private static final Logger LOG = Logger.getLogger(PostResource.class);
  private Set<Post> posts = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

  public PostResource() {
    posts.add(new Post("Hello ParisJUG 2019", "Welcome to the Che7 demo."));
  }
  
  @GET
  public Response list() {
    return Response.ok(posts).build();
  }

  @POST
  public Response add(Post post) {
    posts.add(post);
    return Response.ok(posts).build();
  }

  @DELETE
  public Response delete(Post post) {
    return Response.ok().build();
  }
}