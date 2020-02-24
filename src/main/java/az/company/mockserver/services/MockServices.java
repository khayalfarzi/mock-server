package az.company.mockserver.services;

import az.company.mockserver.dto.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockServices {

    public FirstCheckResponse firstCheckResponse(FirstCheckRequest firstCheckRequest) {
        return new FirstCheckResponse("1", "1");
    }

    public SecondCheckResponse secondCheckResponse(SecondCheckRequest secondCheckRequest) {
        List<PaymentDTO> paymentDTOList = new ArrayList<>();


        paymentDTOList.add(new PaymentDTO("5379327353455454", 545656.098, "AZN", "jsbfbvbwmhsbbvdmbbkfnsaknvjbfjbvvsnbnvmbhglhejh,svbnbmnv,nfmdnvmvbvbvbbdn"));
        paymentDTOList.add(new PaymentDTO("53793354515545435", 5421.098, "USD", "jsbfbvbwmhsbbvdmbbkfnsaknvjbfjbvvsnbnvmbhglhejh,svbnbmnv,nfmdnvmvbvbvbbdn"));
        paymentDTOList.add(new PaymentDTO("53793278898989898", 54659.098, "AZN", ".gsdfk.vnfvmbk.fm.smbmsfkbmamhsbbvdmbbkfnsaknvjbfjbvvsnbnvmbhglhejh,svbnbmnv,nfmdnvmvbvbvbbdn"));
        paymentDTOList.add(new PaymentDTO("53793278957323232557", 5321.098, "EUR", "jsbf9889565458864864nvjbfjbvvsnbnvmbhglhejh,svbnbmnv,nfmdnvmvbvbvbbdn"));
        paymentDTOList.add(new PaymentDTO("53793287412124", 54874.098, "AZN", "jsbf867fsjckj86fS7FA7RG7Z5vjbfjbvvsnbnvmbhglhejh,svbnbmnv,nfmdnvmvbvbvbbdn"));

        return new SecondCheckResponse("3", paymentDTOList);
    }

}
