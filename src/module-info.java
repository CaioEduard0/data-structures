module com.questions.dataStructures {
	
	//GET methods for consuming api's
	//taking object of api by id
//	ResponseEntity<UserDTO> entity = new RestTemplate()
//			.getForEntity("http://localhost:8080/users/1", UserDTO.class);
//	
//	UserDTO user = new RestTemplate().getForObject("http://localhost:8080/users/1", UserDTO.class);
//	
//	//taking all users of api (List should be non pageable because of attributes)
//	UserDTO[] users = new RestTemplate().getForObject("http://localhost:8080/users/...", UserDTO[].class);
//	
//	ResponseEntity<List<UserDTO>> exchange = new RestTemplate().exchange("url", HttpMethod.GET, null,
//			new ParameterizedTypeReference<>() {});
//	
	//POST methods for consuming api's
	//create a user for insert in the api
	//UserDTO u = new RestTemplate().postForObject("url", objectToInsert, UserDTO.class);
	
	//ResponseEntity<UserDTO> uu = new RestTemplate().exchange("url", HttpMethod.POST,
		//	new HttpEntity<T>(objectToInsert/saved), UserDTO.class);
	
	//Put and Delete are basically equal to post, but returns void. To have 
	//information about their status we have to get the return in a ResponseEntity.	

}