package app.domain.equipment;

import app.domain.loadout.Loadout;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public EquipmentService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public List<Equipment> getByLoadout(Loadout loadout) {
        return equipmentRepository.findAllById(loadout.getId());
    }

    @Transactional
    public void deleteAllByLoadout(Loadout loadout) {
        equipmentRepository.deleteAllById(loadout.getId());
    }

    @Transactional
    public Equipment save(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }
}
