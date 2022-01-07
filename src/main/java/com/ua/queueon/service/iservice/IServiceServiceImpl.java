package com.ua.queueon.service.iservice;

import com.ua.queueon.persistence.index.IService;
import com.ua.queueon.persistence.repository.IServiceRepository;
import com.ua.queueon.persistence.repository.MasterRepository;
import com.ua.queueon.persistence.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IServiceServiceImpl implements IServiceService {

    private final IServiceRepository repository;
    private final MasterRepository mrepository;
    private final RecordRepository rrepository;

    @Override
    public Iterable<IService> findAllServices() {
        return repository.findAll();
    }

    @Override
    public void createService() {
//        IService iService = new IService();
//        iService.setName("Nails");
//        iService.setPrice(200);
//        repository.save(iService);
//
//        Master master = new Master();
//        master.setName("Ihor Barber");
//        master.setSurname("CHIP");
//        master.setIServices(Collections.singletonList(iService));
//        mrepository.save(master);
//
//        Record record = new Record();
//        record.setAddress("Nauki avenu");
//        record.setIService(iService);
//        record.setMaster(master);
//        record.setTimeFrom(LocalDateTime.now().minusDays(4));
//        record.setTimeTo(LocalDateTime.now().minusDays(2));
//        rrepository.save(record);
    }
}
