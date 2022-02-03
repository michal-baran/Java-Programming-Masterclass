public class DwarfPlanet extends HeavenlyBody{
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        return super.addSatellite(moon);
    }
}
