<script setup lang="ts">
import { navigationMenuTriggerStyle } from '@/components/ui/navigation-menu';
import type { NavigationData } from '@/utils/navigation';

defineProps<{ links: NavigationData }>()
</script>

<template>
    <NavigationMenu>
        <NavigationMenuList>
            <NavigationMenuItem v-for="page in links.pages" :key="page.meta.id">
                <div v-if="page.hasChildren">
                    <NavigationMenuTrigger>{{ page.meta.name }}</NavigationMenuTrigger>
                    <NavigationMenuContent>
                        <NuxtLink v-for="link in page.children" v-slot="{ isActive, href, navigate }" :key="link.id"
                            :to="link.target" custom>
                            <NavigationMenuLink :active="isActive" :href :class="navigationMenuTriggerStyle()"
                                @click="navigate">
                                {{ link.name }}
                            </NavigationMenuLink>
                        </NuxtLink>
                    </NavigationMenuContent>
                </div>
                <div v-else>
                    <NuxtLink v-slot="{ isActive, href, navigate }" :key="page.self?.id" :to="page.self?.target" custom>
                        <NavigationMenuLink :active="isActive" :href :class="navigationMenuTriggerStyle()"
                            @click="navigate">
                            {{ page.self?.name }}
                        </NavigationMenuLink>
                    </NuxtLink>
                </div>
            </NavigationMenuItem>
        </NavigationMenuList>
    </NavigationMenu>
</template>