package com.example.medicalapi.controller;

import com.example.medicalapi.model.MedicalActType;
import com.example.medicalapi.model.MedicalAssetType;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Medical reference data")
public class MedicalReferenceController {

    private static final List<MedicalAssetType> ASSET_TYPES = List.of(
            new MedicalAssetType("VENT", "Ventilator", "Mechanical ventilator for assisted breathing"),
            new MedicalAssetType("ULTR", "Ultrasound Machine", "Diagnostic ultrasound imaging"),
            new MedicalAssetType("DEFIB", "Defibrillator", "Automated external defibrillator"),
            new MedicalAssetType("SYRG", "Syringe Pump", "Infusion pump for precise dosing")
    );

    private static final List<MedicalActType> ACT_TYPES = List.of(
            new MedicalActType("CONSULT", "General Consultation", "Consultation"),
            new MedicalActType("XRAY", "Radiography", "Imaging"),
            new MedicalActType("BLOOD", "Blood Test", "Laboratory"),
            new MedicalActType("SURG", "Minor Surgery", "Surgery")
    );

    @GetMapping("/medical-asset-types")
    @Operation(summary = "List available medical asset types")
    public List<MedicalAssetType> getMedicalAssetTypes() {
        return ASSET_TYPES;
    }

    @GetMapping("/medical-act-types")
    @Operation(summary = "List available medical act types")
    public List<MedicalActType> getMedicalActTypes() {
        return ACT_TYPES;
    }
}
