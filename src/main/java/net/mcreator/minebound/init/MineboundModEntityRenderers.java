
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.minebound.client.renderer.YokatMobRenderer;
import net.mcreator.minebound.client.renderer.WisperMobRenderer;
import net.mcreator.minebound.client.renderer.VoltipMobRenderer;
import net.mcreator.minebound.client.renderer.TwigunMobRenderer;
import net.mcreator.minebound.client.renderer.TriplodMobRenderer;
import net.mcreator.minebound.client.renderer.TrifangleMobRenderer;
import net.mcreator.minebound.client.renderer.TrictusMobRestingRenderer;
import net.mcreator.minebound.client.renderer.TrictusMobRenderer;
import net.mcreator.minebound.client.renderer.ToumingoMobRenderer;
import net.mcreator.minebound.client.renderer.TinticMobRenderer;
import net.mcreator.minebound.client.renderer.TentacleSpawnerMobRenderer;
import net.mcreator.minebound.client.renderer.TentacleGnatMobRenderer;
import net.mcreator.minebound.client.renderer.TentacleGhostMobRenderer;
import net.mcreator.minebound.client.renderer.TentacleCrawlerMobRenderer;
import net.mcreator.minebound.client.renderer.TentacleClamMobRenderer;
import net.mcreator.minebound.client.renderer.TentacleBombMobRenderer;
import net.mcreator.minebound.client.renderer.TaroniMobRenderer;
import net.mcreator.minebound.client.renderer.SwarpionMobRenderer;
import net.mcreator.minebound.client.renderer.SqueemMobRenderer;
import net.mcreator.minebound.client.renderer.SporgusMobRenderer;
import net.mcreator.minebound.client.renderer.SpookitMobRenderer;
import net.mcreator.minebound.client.renderer.SpinemineMobRenderer;
import net.mcreator.minebound.client.renderer.SnuffishMobRenderer;
import net.mcreator.minebound.client.renderer.SnauntMobRenderer;
import net.mcreator.minebound.client.renderer.SnagglerMobRenderer;
import net.mcreator.minebound.client.renderer.SmoglinMobRenderer;
import net.mcreator.minebound.client.renderer.SkimbusMobRenderer;
import net.mcreator.minebound.client.renderer.ScaveranMobRenderer;
import net.mcreator.minebound.client.renderer.ScandroidMobRenderer;
import net.mcreator.minebound.client.renderer.ScandroidMobChargingRenderer;
import net.mcreator.minebound.client.renderer.RustickMobRenderer;
import net.mcreator.minebound.client.renderer.RobotChickenMobRenderer;
import net.mcreator.minebound.client.renderer.RingramMobRenderer;
import net.mcreator.minebound.client.renderer.RacerMob6Renderer;
import net.mcreator.minebound.client.renderer.RacerMob5Renderer;
import net.mcreator.minebound.client.renderer.RacerMob4Renderer;
import net.mcreator.minebound.client.renderer.RacerMob3Renderer;
import net.mcreator.minebound.client.renderer.RacerMob2Renderer;
import net.mcreator.minebound.client.renderer.RacerMob1Renderer;
import net.mcreator.minebound.client.renderer.QuagmuttMobRenderer;
import net.mcreator.minebound.client.renderer.PyromantleMobRenderer;
import net.mcreator.minebound.client.renderer.PunchyMobRenderer;
import net.mcreator.minebound.client.renderer.PulpinMobRenderer;
import net.mcreator.minebound.client.renderer.PoptopMobRenderer;
import net.mcreator.minebound.client.renderer.PolingMobRenderer;
import net.mcreator.minebound.client.renderer.PoletMobRenderer;
import net.mcreator.minebound.client.renderer.PoMobRenderer;
import net.mcreator.minebound.client.renderer.PoGolemMobRenderer;
import net.mcreator.minebound.client.renderer.PlayerHeadHUDEntityRenderer;
import net.mcreator.minebound.client.renderer.PipkinMobRenderer;
import net.mcreator.minebound.client.renderer.PetropodMobRenderer;
import net.mcreator.minebound.client.renderer.PetricubMobRenderer;
import net.mcreator.minebound.client.renderer.PeblitMobRestingRenderer;
import net.mcreator.minebound.client.renderer.PeblitMobRenderer;
import net.mcreator.minebound.client.renderer.ParatailMobRenderer;
import net.mcreator.minebound.client.renderer.ParaspriteMobRenderer;
import net.mcreator.minebound.client.renderer.OrbideMobRestingRenderer;
import net.mcreator.minebound.client.renderer.OrbideMobRenderer;
import net.mcreator.minebound.client.renderer.OoglerMobRenderer;
import net.mcreator.minebound.client.renderer.OmnicannonMobRenderer;
import net.mcreator.minebound.client.renderer.OculobMobRenderer;
import net.mcreator.minebound.client.renderer.NutmidgelingMobRenderer;
import net.mcreator.minebound.client.renderer.NutmidgeMobRenderer;
import net.mcreator.minebound.client.renderer.NutmidgeMobChargingRenderer;
import net.mcreator.minebound.client.renderer.NarfinMobRenderer;
import net.mcreator.minebound.client.renderer.MotherPoptopMobRenderer;
import net.mcreator.minebound.client.renderer.MooshiMobRenderer;
import net.mcreator.minebound.client.renderer.MoontantMobRenderer;
import net.mcreator.minebound.client.renderer.MonopusMobRenderer;
import net.mcreator.minebound.client.renderer.MonopusMobChargingRenderer;
import net.mcreator.minebound.client.renderer.MiniDroneMobRenderer;
import net.mcreator.minebound.client.renderer.MiasmopMobRenderer;
import net.mcreator.minebound.client.renderer.MechTestLegRightRenderer;
import net.mcreator.minebound.client.renderer.MechTestLegLeftRenderer;
import net.mcreator.minebound.client.renderer.MechTestBodyRenderer;
import net.mcreator.minebound.client.renderer.MechTestArmRightRenderer;
import net.mcreator.minebound.client.renderer.MechTestArmLeftRenderer;
import net.mcreator.minebound.client.renderer.MasteroidMobSRenderer;
import net.mcreator.minebound.client.renderer.MasteroidMobRenderer;
import net.mcreator.minebound.client.renderer.MasteroidMobMRenderer;
import net.mcreator.minebound.client.renderer.MasteroidMobLRenderer;
import net.mcreator.minebound.client.renderer.MandrafloraMobRenderer;
import net.mcreator.minebound.client.renderer.LumothMobRenderer;
import net.mcreator.minebound.client.renderer.LilodonMobRenderer;
import net.mcreator.minebound.client.renderer.KluexTotemMobRenderer;
import net.mcreator.minebound.client.renderer.KluexSentryMobRenderer;
import net.mcreator.minebound.client.renderer.KingNutmidgelingMobRenderer;
import net.mcreator.minebound.client.renderer.IxolingMobRenderer;
import net.mcreator.minebound.client.renderer.IguarmorMobRenderer;
import net.mcreator.minebound.client.renderer.IgnomeMobRenderer;
import net.mcreator.minebound.client.renderer.HypnareMobRenderer;
import net.mcreator.minebound.client.renderer.HemogoblinMobRenderer;
import net.mcreator.minebound.client.renderer.HemogoblinMobRearRenderer;
import net.mcreator.minebound.client.renderer.HemogoblinMobFrontRenderer;
import net.mcreator.minebound.client.renderer.HeavyDroneMobRenderer;
import net.mcreator.minebound.client.renderer.GosmetMobRenderer;
import net.mcreator.minebound.client.renderer.GleapMobRenderer;
import net.mcreator.minebound.client.renderer.FluffaloPoisonMobRenderer;
import net.mcreator.minebound.client.renderer.FluffaloMobRenderer;
import net.mcreator.minebound.client.renderer.FluffaloIceMobRenderer;
import net.mcreator.minebound.client.renderer.FluffaloFireMobRenderer;
import net.mcreator.minebound.client.renderer.FluffaloElectricMobRenderer;
import net.mcreator.minebound.client.renderer.FennixMobRenderer;
import net.mcreator.minebound.client.renderer.ErchiusGhostMobRenderer;
import net.mcreator.minebound.client.renderer.CrutterMobRenderer;
import net.mcreator.minebound.client.renderer.CrustoiseMobRenderer;
import net.mcreator.minebound.client.renderer.CrustoiseMobChargingRenderer;
import net.mcreator.minebound.client.renderer.CrabcanoMobRenderer;
import net.mcreator.minebound.client.renderer.CosmostacheMobRenderer;
import net.mcreator.minebound.client.renderer.CosmicIntruderMobRenderer;
import net.mcreator.minebound.client.renderer.ChiropterrorMobRenderer;
import net.mcreator.minebound.client.renderer.ChickenMobRenderer;
import net.mcreator.minebound.client.renderer.CapricoatMobRenderer;
import net.mcreator.minebound.client.renderer.BulbopMobRenderer;
import net.mcreator.minebound.client.renderer.BobotMobRenderer;
import net.mcreator.minebound.client.renderer.BobotMobChargingRenderer;
import net.mcreator.minebound.client.renderer.BobfaeMobRenderer;
import net.mcreator.minebound.client.renderer.BlockIndicatorEntity3Renderer;
import net.mcreator.minebound.client.renderer.BlockIndicatorEntity2Renderer;
import net.mcreator.minebound.client.renderer.BlockIndicatorEntity1Renderer;
import net.mcreator.minebound.client.renderer.BatongMobRestingRenderer;
import net.mcreator.minebound.client.renderer.BatongMobRenderer;
import net.mcreator.minebound.client.renderer.AstrofaeMobRenderer;
import net.mcreator.minebound.client.renderer.ApexMutantMobRenderer;
import net.mcreator.minebound.client.renderer.AnglureMobRenderer;
import net.mcreator.minebound.client.renderer.AgrobatMobRestingRenderer;
import net.mcreator.minebound.client.renderer.AgrobatMobRenderer;
import net.mcreator.minebound.client.renderer.AdultPoptopMobRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MineboundModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MineboundModEntities.MECH_TEST_BODY.get(), MechTestBodyRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MECH_TEST_ARM_LEFT.get(), MechTestArmLeftRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MECH_TEST_ARM_RIGHT.get(), MechTestArmRightRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MECH_TEST_LEG_LEFT.get(), MechTestLegLeftRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MECH_TEST_LEG_RIGHT.get(), MechTestLegRightRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.GLEAP_MOB.get(), GleapMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.NUTMIDGE_MOB.get(), NutmidgeMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.NUTMIDGELING_MOB.get(), NutmidgelingMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.KING_NUTMIDGELING_MOB.get(), KingNutmidgelingMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.POPTOP_MOB.get(), PoptopMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.ADULT_POPTOP_MOB.get(), AdultPoptopMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.CRUSTOISE_MOB.get(), CrustoiseMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TINTIC_MOB.get(), TinticMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.BATONG_MOB.get(), BatongMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SPOOKIT_MOB.get(), SpookitMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PEBLIT_MOB.get(), PeblitMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.IGUARMOR_MOB.get(), IguarmorMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SCAVERAN_MOB.get(), ScaveranMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.VOLTIP_MOB.get(), VoltipMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.FENNIX_MOB.get(), FennixMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.LILODON_MOB.get(), LilodonMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PETRICUB_MOB.get(), PetricubMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PARATAIL_MOB.get(), ParatailMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.WISPER_MOB.get(), WisperMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SKIMBUS_MOB.get(), SkimbusMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PULPIN_MOB.get(), PulpinMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.CAPRICOAT_MOB.get(), CapricoatMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SCANDROID_MOB.get(), ScandroidMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.BOBOT_MOB.get(), BobotMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MONOPUS_MOB.get(), MonopusMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SNAGGLER_MOB.get(), SnagglerMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.OCULOB_MOB.get(), OculobMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MIASMOP_MOB.get(), MiasmopMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.AGROBAT_MOB.get(), AgrobatMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SQUEEM_MOB.get(), SqueemMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SNAUNT_MOB.get(), SnauntMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PETROPOD_MOB.get(), PetropodMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.CRUTTER_MOB.get(), CrutterMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SNUFFISH_MOB.get(), SnuffishMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.CRABCANO_MOB.get(), CrabcanoMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PYROMANTLE_MOB.get(), PyromantleMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.IGNOME_MOB.get(), IgnomeMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SMOGLIN_MOB.get(), SmoglinMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.BOBFAE_MOB.get(), BobfaeMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.ERCHIUS_GHOST_MOB.get(), ErchiusGhostMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.QUAGMUTT_MOB.get(), QuagmuttMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.RINGRAM_MOB.get(), RingramMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PIPKIN_MOB.get(), PipkinMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SPORGUS_MOB.get(), SporgusMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.ANGLURE_MOB.get(), AnglureMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.LUMOTH_MOB.get(), LumothMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.OOGLER_MOB.get(), OoglerMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.NARFIN_MOB.get(), NarfinMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TOUMINGO_MOB.get(), ToumingoMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TRICTUS_MOB.get(), TrictusMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MANDRAFLORA_MOB.get(), MandrafloraMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.BULBOP_MOB.get(), BulbopMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.HYPNARE_MOB.get(), HypnareMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.YOKAT_MOB.get(), YokatMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.ORBIDE_MOB.get(), OrbideMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TARONI_MOB.get(), TaroniMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.HEMOGOBLIN_MOB.get(), HemogoblinMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.APEX_MUTANT_MOB.get(), ApexMutantMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.GOSMET_MOB.get(), GosmetMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.IXOLING_MOB.get(), IxolingMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.KLUEX_SENTRY_MOB.get(), KluexSentryMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.KLUEX_TOTEM_MOB.get(), KluexTotemMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MINI_DRONE_MOB.get(), MiniDroneMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MOTHER_POPTOP_MOB.get(), MotherPoptopMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MOONTANT_MOB.get(), MoontantMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PO_MOB.get(), PoMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.POLET_MOB.get(), PoletMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.POLING_MOB.get(), PolingMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PO_GOLEM_MOB.get(), PoGolemMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PUNCHY_MOB.get(), PunchyMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SWARPION_MOB.get(), SwarpionMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TENTACLE_BOMB_MOB.get(), TentacleBombMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TENTACLE_CLAM_MOB.get(), TentacleClamMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TENTACLE_CRAWLER_MOB.get(), TentacleCrawlerMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TENTACLE_GHOST_MOB.get(), TentacleGhostMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TENTACLE_GNAT_MOB.get(), TentacleGnatMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TENTACLE_SPAWNER_MOB.get(), TentacleSpawnerMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TRIPLOD_MOB.get(), TriplodMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PARASPRITE_MOB.get(), ParaspriteMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.COSMIC_INTRUDER_MOB.get(), CosmicIntruderMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.CHICKEN_MOB.get(), ChickenMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.ROBOT_CHICKEN_MOB.get(), RobotChickenMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MOOSHI_MOB.get(), MooshiMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.FLUFFALO_MOB.get(), FluffaloMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.FLUFFALO_FIRE_MOB.get(), FluffaloFireMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.FLUFFALO_POISON_MOB.get(), FluffaloPoisonMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.FLUFFALO_ICE_MOB.get(), FluffaloIceMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.FLUFFALO_ELECTRIC_MOB.get(), FluffaloElectricMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.ASTROFAE_MOB.get(), AstrofaeMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.CHIROPTERROR_MOB.get(), ChiropterrorMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.COSMOSTACHE_MOB.get(), CosmostacheMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.HEAVY_DRONE_MOB.get(), HeavyDroneMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MASTEROID_MOB.get(), MasteroidMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.OMNICANNON_MOB.get(), OmnicannonMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.RUSTICK_MOB.get(), RustickMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SPINEMINE_MOB.get(), SpinemineMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TRIFANGLE_MOB.get(), TrifangleMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TWIGUN_MOB.get(), TwigunMobRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.RACER_MOB_1.get(), RacerMob1Renderer::new);
		event.registerEntityRenderer(MineboundModEntities.RACER_MOB_2.get(), RacerMob2Renderer::new);
		event.registerEntityRenderer(MineboundModEntities.RACER_MOB_3.get(), RacerMob3Renderer::new);
		event.registerEntityRenderer(MineboundModEntities.RACER_MOB_4.get(), RacerMob4Renderer::new);
		event.registerEntityRenderer(MineboundModEntities.RACER_MOB_5.get(), RacerMob5Renderer::new);
		event.registerEntityRenderer(MineboundModEntities.RACER_MOB_6.get(), RacerMob6Renderer::new);
		event.registerEntityRenderer(MineboundModEntities.PLAYER_HEAD_HUD_ENTITY.get(), PlayerHeadHUDEntityRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.BLOCK_INDICATOR_ENTITY_1.get(), BlockIndicatorEntity1Renderer::new);
		event.registerEntityRenderer(MineboundModEntities.BLOCK_INDICATOR_ENTITY_3.get(), BlockIndicatorEntity3Renderer::new);
		event.registerEntityRenderer(MineboundModEntities.BLOCK_INDICATOR_ENTITY_2.get(), BlockIndicatorEntity2Renderer::new);
		event.registerEntityRenderer(MineboundModEntities.NUTMIDGE_MOB_CHARGING.get(), NutmidgeMobChargingRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.CRUSTOISE_MOB_CHARGING.get(), CrustoiseMobChargingRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.BATONG_MOB_RESTING.get(), BatongMobRestingRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.PEBLIT_MOB_RESTING.get(), PeblitMobRestingRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.SCANDROID_MOB_CHARGING.get(), ScandroidMobChargingRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.BOBOT_MOB_CHARGING.get(), BobotMobChargingRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MONOPUS_MOB_CHARGING.get(), MonopusMobChargingRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.AGROBAT_MOB_RESTING.get(), AgrobatMobRestingRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.TRICTUS_MOB_RESTING.get(), TrictusMobRestingRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.ORBIDE_MOB_RESTING.get(), OrbideMobRestingRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.HEMOGOBLIN_MOB_FRONT.get(), HemogoblinMobFrontRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.HEMOGOBLIN_MOB_REAR.get(), HemogoblinMobRearRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MASTEROID_MOB_L.get(), MasteroidMobLRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MASTEROID_MOB_M.get(), MasteroidMobMRenderer::new);
		event.registerEntityRenderer(MineboundModEntities.MASTEROID_MOB_S.get(), MasteroidMobSRenderer::new);
	}
}
