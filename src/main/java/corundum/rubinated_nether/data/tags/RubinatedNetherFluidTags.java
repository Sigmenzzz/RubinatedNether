package corundum.rubinated_nether.data.tags;

import java.util.concurrent.CompletableFuture;

import corundum.rubinated_nether.RubinatedNether;
import corundum.rubinated_nether.content.RubinatedNetherTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class RubinatedNetherFluidTags extends FluidTagsProvider {
	public RubinatedNetherFluidTags(
		PackOutput output, 
		CompletableFuture<HolderLookup.Provider> lookupProvider, 
		ExistingFileHelper existingFileHelper
	) {
		super(output, lookupProvider, RubinatedNether.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider provider) {
		this.tag(RubinatedNetherTags.Fluids.COLDEST_FLUID).add(
			Fluids.WATER // This cannot be placed in the Nether naturally, it is here exclusively for testing purposes
		);
	}
}
