package resources;
//enum is a special class in java which has collection of constants and methods
public enum ApiResources {
    addPlaceAPI("/maps/api/place/add/json"),
    getPlaceAPI("/maps/api/place/get/json"),
    deletePlaceAPI("/maps/api/place/delete/json"),
    //goRest("/public-api/users/123/posts");
    goRestAPI("/public-api/users/123/posts");
    private String resource;

    ApiResources(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}
