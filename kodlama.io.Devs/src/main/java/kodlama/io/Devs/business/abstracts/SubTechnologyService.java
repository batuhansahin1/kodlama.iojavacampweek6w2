package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.CreateSubTechnologyRequest;
import kodlama.io.Devs.business.requests.UpdateSubTechnologyRequest;
import kodlama.io.Devs.business.responses.GetAllSubTechnologyResponse;
import kodlama.io.Devs.entities.concretes.SubTechnology;

public interface SubTechnologyService {
List<GetAllSubTechnologyResponse> getAll();
public void add(CreateSubTechnologyRequest createSubTechnology);
SubTechnology getById(int id);
public void delete(int id);

public void update(UpdateSubTechnologyRequest updateRequest, int id);
}
