package Autowiring.Keywords;

@RestController
@RequestMapping("/vehicle")
public class Controller_Vehicle {
	@Autowired
	private Vehicle vehicle;
	
	@GetMapping
	public String getVehicleCharacteristics() {
		vehicle.Characteristics();
	}
}
