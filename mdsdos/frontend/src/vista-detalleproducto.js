import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaDetalleproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 80%;">
  <vaadin-vertical-layout theme="spacing">
   <label style="font-weight: bold; margin: 20%; align-self: flex-start; width: 100%;">Titulo del producto</label>
   <label style="margin: var(--lumo-space-xs); align-self: flex-start;">Valoración media </label>
  </vaadin-vertical-layout>
  <img style="border: solid; height: 20%; width: 80%; align-self: center;">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 10%;">
   <label style="padding: 0;font-weight: bold;">Descripción del producto</label>
   <label style="padding: 0; margin: 0;">Label</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 90%; height: 10%; border:solid; margin-left: var(--lumo-space-m); align-self: center;">
   <label style="padding: 0;font-weight: bold;">Características</label>
   <label style="padding: 0; margin: 0; margin-left: var(--lumo-space-xl);">-característica 1</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 80%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <vaadin-button>
     Modificar
    </vaadin-button>
    <vaadin-button>
     Ver comentarios
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <label>Precio</label>
    <vaadin-button style="margin-top: var(--lumo-space-l);">
     Quitar ofertas
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-detalleproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDetalleproducto.is, VistaDetalleproducto);
